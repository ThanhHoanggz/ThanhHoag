public class Xemay {
    String hang;
    String model;
    Float gia;
    Integer vanToc;
    Integer soHienTai;
    Boolean dangChay;
    // Hàm Khởi Tạo.
    public Xemay(String hang, String model , Float gia, Integer vanToc){
        this.hang = hang;
        this.model = model;
        this.gia = gia;
        this.vanToc = vanToc;
        this.soHienTai = 0;
        this.dangChay = false;
    }
    public void bat(){
        this.soHienTai = 1;
        System.out.println("Thuc hien chuc nang bat xe máy");
    }
    public void tat(){
        this.soHienTai = 0;
        System.out.println("Thực hiện chức năng bật xe máy");
    }
    public void chuyenSo(int so){
        this.soHienTai = so;
        System.out.println("Chuyen toi so:" + so);
    }
    public void chuyenChay(){
        if (this.dangChay) {
            this.dangChay = false;
            System.out.println("Chuyển sang trạng thái đứng yên");
        }else {
            this.dangChay = true;
            System.out.println("Chuyển sang trạng thái chạy");
        }
    }

    @Override
    public String toString() {
        return "xeMay{" +
                "hang='" + hang + '\'' +
                ", model='" + model + '\'' +
                ", gia=" + gia +
                ", vanToc=" + vanToc +
                ", soHienTai=" + soHienTai +
                ", dangChay=" + dangChay +
                '}';
    }

    public static void main(String[]args){
        Xemay xemay1 = new Xemay("Yamahaa","SQZ-21",2.10F, 60);
        xemay1.bat();
        xemay1.chuyenSo(2);
        xemay1.chuyenChay();
        System.out.println(xemay1);
    }
}