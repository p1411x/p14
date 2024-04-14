




import dao.DanhMucDaoimpl;
import dao.SanPhamDaoimpl;
import dao.TaiKhoanDaoimpl;
import model.SanPham;
public class test {
    
    public static void main(String[] args) {
        SanPhamDaoimpl sp = new SanPhamDaoimpl();
        //System.out.println(sp.getChiTietSanPham("01"));
        TaiKhoanDaoimpl tk =new TaiKhoanDaoimpl();
        System.out.println(tk.KiemTraTaiKhoan("admin@gmail.com"));
    }
}
