package com.tlc.mybatis.common;

import com.github.pagehelper.Page;

import java.io.Serializable;

public class Pager implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     * 每页默认行数
     */
    private final int DEFAULT_PAGE_ROWS = 0;

    /**
     * 总行数
     */
    private int totalRows = 0;

    /**
     * 每页显示的行数
     */
    private int rows = DEFAULT_PAGE_ROWS;

    /**
     * 当前页
     */
    private int page = 1;

    /**
     * 默认构造方法
     */
    public Pager()
    {
    }

    /**
     * 构造方法
     * @param page 当前页
     */
    public Pager(int page)
    {
        setPage(page);
    }

    /**
     * 构造方法
     * @param page 当前页
     * @param rows 每页行数
     */
    public Pager(int page, int rows)
    {
        setPage(page);
        setRows(rows);
    }

    /**
     * 构造方法
     * @param page 当前页
     * @param rows 每页行数
     * @param totalRows 总行数
     */
    public Pager(int page, int rows, int totalRows)
    {
        setPage(page);
        setRows(rows);
        setTotalRows(totalRows);
    }

    /**
     * 构造方法
     * @param page
     */
    public Pager(Page<?> page) {
        setPage(page.getPageNum());
        setRows(page.getPageSize());
        setTotalRows(Integer.parseInt(String.valueOf(page.getTotal())));
    }

    /**
     * 设置当前页
     * @param page 当前页，如果小于1，则设为1。
     */
    public void setPage(int page)
    {
        this.page = page < 1 ? 1 : page;
    }

    /**
     * 设置每页行数
     * @param rows 每页行数，如果小于1则设为默认行数
     */
    public void setRows(int rows)
    {
        this.rows = rows < 1 ? DEFAULT_PAGE_ROWS : rows;
    }

    /**
     * 设置总行数，如果总行数小于0则为0。
     * @param totalRows 总行数，如果小于0则设为0。
     */
    public void setTotalRows(Integer totalRows)
    {
        this.totalRows = totalRows < 0 ? 0 : totalRows;
    }


    /**
     * 获得请求页数
     * @return 请求页数
     */
    public int getPage()
    {
        return page;
    }

    /**
     * 获得请求的每页行数
     * @return 请求的每页行数
     */
    public int getRows()
    {
        return rows;
    }

    /**
     * 获得默认每页行数
     * @return 默认每页行数
     */
    public int getDefaultrows()
    {
        return DEFAULT_PAGE_ROWS;
    }

    /**
     * 获得总行数
     * @return 总行数
     */
    public int getTotalRows()
    {
        return totalRows;
    }

    /**
     * 获得总页数
     * @return 总页数
     */
    public int getTotalPages()
    {
        return rows == 0 ? totalRows : totalRows / rows + (totalRows % rows == 0 ? 0 : 1);
    }

    /**
     * 获得实际当前页的行数
     * @return 实际当前页行数
     */
    public int getCurrRows()
    {
        if (page > getTotalPages())
        {
            return 0;
        }
        else if (totalRows / page < rows)
        {
            return totalRows % rows;
        }
        else
        {
            return rows;
        }
    }

    /**
     * 是否有前一页
     * @return true有前一页，否则没有
     */
    public boolean getHasPrevPage()
    {
        return page > 1;
    }

    /**
     * 是否有后一页
     * @return true有后一页，否则没有
     */
    public boolean getHasNextPage()
    {
        return page < getTotalPages();
    }

    @Override
    public String toString()
    {
        return "{page:" + getPage() + ",rows:" + getRows() + ",totalRows:"
                + getTotalRows() + ",totalPages:" + getTotalPages() + ",CurrRows:"
                + getCurrRows() + ",pageStartRow:" + /*getPageStartRow() + */",pageEndRow:"
                + /*getPageEndRow() + */",hasPrevPage:" + getHasPrevPage() + ",hasNextPage:"
                + getHasNextPage() + "}";
    }
}
