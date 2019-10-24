# ttcFresher
I, bài tập về list,set,hashMap.
1, Viết hàm tình tổng nhập vào số tự nhiên n, tính tổng n số tự nhiện liên tiếp từ 0 đến n theo độ phức tạp thuật toán O(n) , O(1)
2, Viết hàm truyền sắp xếp tăng dần với input là list<int> . 
Cho class
Bill {
    int id;
    String name;
    long money;
    String date // format: yyyy-MM-dd, ngày lập hóa đơn 
}
3, Sắp xếp mảng List<Bill> theo thứ tự tăng dần của money. 
4, Cũng với List<Bill> trên viết hàm trả về tập hợp distinct ngày lập hóa đơn.
5, Cũng với List<Bill> trên viết hàm trả về tập list<Bill> có money > 1000000.
6, Viết hàm nhập vào List<Bill> trả về output: HashMap<String, List<Bill>> với key là ngày và value List<Bill> là các Bill có cùng ngày.
7, Với input như trên trả về list của list các Bill cùng ngày - List<List<Bill> => gom list của list các hóa đơn xuất cùng ngày thôi 
8, Input như trên viết hàm trả về Set<Bill> distinct theo id và name. => distinct các bill có cùng id và name giống nhau bằng Set thôi 
II, Bài tập về String. 
1, Truyền chuỗi String và 1 ký tự. Đếm số lần xuất hiện ký tự đó trong chuỗi, vị trí đầu tiên, cuối cùng và vị trí thứ n trong chuỗi. 
Làm tương tự tìm chuỗi thay cho ký tự. 
2, Truyền chuỗi tìm ký tự xuất hiện nhiều nhất trong chuỗi. Tìm tất cả các chuỗi con thuộc chuỗi đã cho (nhớ distinct). Đếm số lần xuất hiện của các chuỗi con đó.
3, Cho list<String> ghép list này thành chuỗi string các nhau bởi dấu ",". 
4, Từ chuỗi String cách nhau bằng dấu "," trên chuyển ngược lại thành List<String> 
5, Viết hàm truyền vào chuỗi String raw, String from, String to. Trả về chuỗi String result là chuỗi raw có tất cả các đoạn bằng from thay thế bằng to.
Ví dụ: raw = "I am fresher", from = "fresher" , to = "senior" => result = "I am senior"
III, Bài tập về Date và SimpleDateFormat.
1, Chuyển chuỗi String có định đạng "yyyy-MM-dd HH:mm:ss" thành java Date. 
2, Cũng chuỗi String bên trên: trả về chuỗi string ngày dầu tháng, cuỗi tháng, đầu tuần, 100 ngày sau theo format: "yyyy/MM/dd"
3, Nhập 2 chuỗi string: a,b chuyển về date và so sánh a có lớn hơn b không. 
4, Nhập 2 chuỗi string: a,b count ngày, tháng, năm của a và b. 
5, Truyền vào String date theo định dạng "yyyy/MM/dd HH:mm:ss" trả về timestamp và ngược lại. 
6, Truyền vào String date theo định dạng "yyyy/MM/dd HH:mm:ss" trả về timestamp làm tròn đến phút, giờ, ngày.
7, Truyền vào String date theo định dạng "yyyy/MM/dd HH:mm:ss" trả về chuỗi định dạng mới "yyyy-MM-dd HH:mm:ss", "MMM yyyy,dd HH:mm:ss"
