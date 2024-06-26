
package model;

/**
 *
 * @author SAD
 */
public class DanhMuc {
    private String maDanhMuc;
    private String tenDanhMuc;
    private String danhMucCha;

    public DanhMuc() {
    }

    public DanhMuc(String maDanhMuc, String tenDanhMuc, String danhMucCha) {
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
        this.danhMucCha = danhMucCha;
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public String getDanhMucCha() {
        return danhMucCha;
    }

    public void setDanhMucCha(String danhMucCha) {
        this.danhMucCha = danhMucCha;
    }

    @Override
    public String toString() {
        return "DanhMuc{" + "maDanhMuc=" + maDanhMuc + ", tenDanhMuc=" + tenDanhMuc + ", danhMucCha=" + danhMucCha + '}';
    }

   
    }
    

  