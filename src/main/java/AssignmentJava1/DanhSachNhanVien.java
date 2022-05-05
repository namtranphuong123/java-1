/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentJava1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public  class DanhSachNhanVien {
    
    private ArrayList<NhanVien> list = new ArrayList<>();
      
     
         
    
Scanner scanner = new Scanner(System.in);
public  void nhapDSao() {
        
        list.add(new NhanVienHanhChinh("nv1", "Tran Phuong Nam", 1200));
         list.add(new NhanVienTiepThi("nv2", "Tran Phuong Toan", 1200, 10, 10));
          list.add(new TruongPhong("nv3", "Nguyen Ngoc Bui", 200, 100));
           
}
    public  void nhap() {
    
       
        /*Phương thức nhập vào nhân viên 
        ++dừng gói scanner để nhận dữ liệu truyền vào từ bàn phím 
        ++dùng vòng lặp để nhập vào nhân viên nếu điều kiện duy trì là (true) thì tiếp tục nếu điều kiện false , break và lưu vào arraylist
        */
        Scanner scanner = new Scanner(System.in);
        do {            
            System.out.println("xin moi nhap loai nhan vien \n"
                    + "1 : Hanh chinh \n"
                    + "2 : truong phong \n"
                    + "3 : tiep thi \n"
                    + "enter de thoat");
            String Loai=scanner.nextLine();
            if(Loai == null || Loai.equals(""))
                break;
            int iLoai = Integer.parseInt(Loai);
            switch(iLoai){
                case 1:
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    nvhc.nhap(scanner);
                    list.add(nvhc);
                    break;
                    case 2:
                    TruongPhong tp = new TruongPhong();
                            tp.nhap(scanner);
                            list.add(tp);
                    break;
                    case 3:
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.nhap(scanner);
                    list.add(nvtt);
                    break;
            }
            
            
         } while (true);
    }
    public void xuat() {
        /*
        ++dùng vòng lặp for each để duyêt danh sách nhân viên 
        ++dùng kỹ thuật instanceof để xác định nhân viên thuộc lớp đại hay không từ đó xuất ra thông tin của nhân viên đó.
        
        */
        System.out.println("Danh Sach Nhan Vien");
        for (NhanVien nhv : list) {
            if(nhv instanceof NhanVienHanhChinh){
                ((NhanVienHanhChinh)nhv).xuat();
            }else if(nhv instanceof NhanVienTiepThi){
                ((NhanVienTiepThi)nhv).xuat();
            }else if(nhv instanceof TruongPhong){
                ((TruongPhong)nhv).xuat();
            }
                
            System.out.println("\n--------------------------");
        }
        
    }
     public void findById() {
         /*
         dùng scanner để chuyền vào mã cần tìm 
         tạo ra 1 biến Found mặc định bằng null
         dùng vòng lặp for each để duyệt qua danh sách nhân viên 
         nếu thông tin mã chuyền vào có trong arraylist thì truyền vào biến found
         dùng if else để in thông tin nhân viên với điều kiện nếu found khác null thì xuất thông tin ra màn hình
         ngược lại in ra màn hình thông báo (không tìm thấy thông tin hợp lệ với mã đã nhập .
         */
        System.out.println("moi nhap ma can tim");
        String ma = scanner.nextLine();
        NhanVien Found = null;
        for (NhanVien ah : list) {
            if(ah.getManv().equalsIgnoreCase(ma)){
                Found = ah;
                break;
            }
        }
        
       if(Found != null){
             System.out.println("thong tin nhan vien can tim la");
             Found.xuat();
        } else{
            System.out.println("thong tin nhan vien khong tim thay" + ma );
        }
        
        
    }
     public void DeleteById() {
         /*
         dùng scanner để nhận mã cần xóa 
         và tạo biến nvFound từ lớp nhân viên mặc định là null
         dùng vòng lặp for each để duyệt danh sách nếu mã nhân viên có trong danh sách hợp với mã truyền vào 
         thì lưu thông tin đó vào biến nvFound 
         sau đó dùng vòng lặp if else để xóa thông tin nhân viên với điều kiện 
         nếu nvFound khác null thì xóa thông tin nhân viên đồng thời in ra thông tin đã được xóa
         ngược lại in ra màn hình thông báo không tìm thấy thông tin nhân viên theo mã
         
         */
        System.out.println("moi nhap ma can xoa");
        String ma = scanner.nextLine();
        NhanVien nvFound = null;
        for (NhanVien nhv : list) {
            if(nhv.getManv().equalsIgnoreCase(ma)){
                nvFound=nhv;
                break;
            }
                
            
        }
        if(nvFound != null){
            list.remove(nvFound);
             System.out.println("thong tin nhan vien da xoa");
             
        }else{
            System.out.println("thong tin nhan vien khong ton tai");
        }
    }
      public void UpdateById() {
          /*
           dùng scanner để nhận mã cần cập nhập
         và tạo biến nvFound từ lớp nhân viên mặc định là null
         dùng vòng lặp for each để duyệt danh sách nếu mã nhân viên có trong danh sách hợp với mã truyền vào 
         thì lưu thông tin đó vào biến nvFound 
         sau đó dùng vòng lặp if else để cập nhập thông tin nhân viên với điều kiện 
         nếu nvFound khác null thì dùng kỹ thuật instanceof để kiểm tra lớp có kế thừa từ lớp đại
          thì dùng phương thức nhập để cập nhập lại nhân viên đó
      


          */
        System.out.println("moi nhap ma can cap nhap");
        String ma = scanner.nextLine();
        NhanVien nvFound = null;
        for (NhanVien item : list) {
            if(item.getManv().equalsIgnoreCase(ma)){
                nvFound= item;
                break;
            }
                
            
        }
        if(nvFound != null){
            if(nvFound instanceof NhanVienHanhChinh){
                ((NhanVienHanhChinh)nvFound).nhap(scanner);
            }else if(nvFound instanceof TruongPhong){
                ((TruongPhong)nvFound).nhap(scanner);
           
        }else if(nvFound instanceof NhanVienTiepThi){
                ((NhanVienTiepThi)nvFound).nhap(scanner);
           
        }
    }
      }
      public void findByLasary() {
         /* dùng scanner để nhận khoảng lương thấp nhất và cao nhất 
         và tạo biến Found từ lớp nhân viên mặc định là false
         dùng vòng lặp for each để duyệt danh sách nếu khoảng lương 
          truyền vào từ bàn phím phù hợp với dữ liệu có trong arraylist 
          thì xuất nhân viên có mức lương nằm trong khoảng đã truyền vào 
          nếu ngược lại thông báo không tìm thấy nhân viên
          
*/
        System.out.println("moi nhap khoang luong thap nhat");
        double min = scanner.nextDouble();
         System.out.println("moi nhap khoang luong cao nhat");
        double max = scanner.nextDouble();
        boolean Found = false;
        for (NhanVien nhv : list) {
            if(min <= nhv.getLuong()&& nhv.getLuong()<= max){
                nhv.xuat();
                Found = true;
            }
                
            
        }
        if(Found == false){
             System.out.println("khong co nhan vien trong khoang luong nay");
             
        }
        
    }
      public void Sort() {
          /*
          dùng sort trong gói collections để xắp xếp nhân viên theo họ tên trong list 
          tạo hai đối tượng cần so sánh và so sánh bằng compareTo và xuất ra với danh sách ABC
          */
   Collections.sort(list,( a , b) -> a.getHoTen().compareTo(b.getHoTen()));
        
               
          
          
      }
       public void SortByIncome() {
           /*
           xuất danh sách theo khoảng thu nhập từ thấp đến cao 
           dùng sort trong gói collections để xắp xếp các nhân viên có trong list 
           với điều kiện khai báo hai đối tượng cần so sánh có kiểu int và so sánh từ nhỏ đến lớn 
           */
          Collections.sort(list,(a,b)->(int)( a.getThuNhap()-b.getThuNhap()));
      }
       public void SelectTop5() {
             /*
           xuất danh sách theo khoảng thu nhập từ thấp đến cao 
           dùng sort trong gói collections để xắp xếp các nhân viên có trong list 
         dùng vòng lặp với các tham số int i =0 và nếu i<5 và (i<list.size() dùng để lấy lức lương cao nhất ) nếu đúng i++
           sau đó từ danh sách  xuất thông tin theo thứ tự duyệt
           */
          Collections.sort(list, (a, b)->(int)(b.getThuNhap()-a.getThuNhap()));
                  System.out.println("top 5 nhan vien co thu nhap cao nhat la");
                  for(int i =0; i<5&&i<list.size();i++){
                      list.get(i).xuat();
                  }

      }
         public  void menu() {
             /*
             Dùng scanner để nhận dữ liệu truyền vào từ bàn phím 
             dùng sswich để thực hiện các chức năng trong menu 
             nếu điều kiện đúng thì tiếp tục vòng swich 
             nếu sai break 
             defaul để kết thúc nếu sai thông số với vòng lặp swich.
             */
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("v>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>v");
            System.out.println("v 1: nhap danh sach nhan vien.                                 ->    1          v");
            System.out.println("v 2: xuat nhan vien tu ban phim.                               ->    2          v");
            System.out.println("v 3: tim va hien thi nhan vien theo ma nhap tu ban phim.       ->    3          v");
            System.out.println("v 4: xoa nhan vien theo ma nhap tu ban phim.                   ->    4          v");
            System.out.println("v 5: cap nhap nhan vien theo ma nhap tu ban phim.              ->    5          v");
            System.out.println("v 6: tim va hien thi nhan vien co muc luong nhap tu ban phim.  ->    6          v");
            System.out.println("v 7: sap xep nhan vien theo ho ten.                            ->    7          v");
            System.out.println("v 8: sap xep nhan vien theo  muc luong.                        ->    8          v");
            System.out.println("v 9: xuat nam nhan vien co muc luong cao nhat.                 ->    9          v");
            System.out.println("v 10: tao danh sach nhan vien                                               ->    10         v");
            System.out.println("v>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>v");
            System.out.println("xin moi chon chuc nang tu 1 toi 10  ");

            int chon = scanner.nextInt();
            
            switch (chon) {
                case 1:
                    System.out.println(" thuc hien chuc nang 1  ");

                    nhap();
                    break;
                case 2:
                    System.out.println(" thuc hien chuc nang 2   ");
                    xuat();

                    break;
                case 3:
                    System.out.println(" thuc hien chuc nang 3   ");
                   findById();
                    break;
                case 4:
                    System.out.println(" thuc hien chuc nang 4   ");
                   DeleteById();
                    break;
                case 5:
                    System.out.println(" thuc hien chuc nang 5   ");
                    UpdateById();
                    break;
                case 6:
                    System.out.println(" thuc hien chuc nang 6   ");
                   findByLasary();
                    break;
                case 7:
                    System.out.println(" thuc hien chuc nang 7   ");
                   Sort();
                    xuat();
                    break;
                case 8:
                    System.out.println(" thuc hien chuc nang 8   ");
                    SortByIncome();
                   xuat();
                    break;
                case 9:
                    System.out.println(" thuc hien chuc nang 9   ");
                    SelectTop5();
                    break;
                    case 10:
                    System.out.println(" thuc hien chuc nang 10   ");
                    System.out.println(" danh sach nhan vien da duoc cap nhap      ");
                    nhapDSao();
                    break;
                default :
                    System.exit(0);
            }
        } while (true);

    }

         
    }
         

      
       

