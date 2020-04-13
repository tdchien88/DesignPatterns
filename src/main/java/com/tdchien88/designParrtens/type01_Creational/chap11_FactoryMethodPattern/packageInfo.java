package com.tdchien88.designParrtens.type01_Creational.chap11_FactoryMethodPattern;

// https://www.javatpoint.com/abstract-factory-pattern
/**
 * Factory Method Pattern
 * 
 * 
 * A Factory Pattern or Factory Method Pattern says that just define an
 * interface or abstract class for creating an object but let the subclasses
 * decide which class to instantiate. In other words, subclasses are responsible
 * to create the instance of the class.
 * 
 * The Factory Method Pattern is also known as Virtual Constructor.
 * 
 * _ Advantage of Factory Design Pattern Factory Method Pattern allows the
 * sub-classes to choose the type of objects to create.
 * 
 * _ It promotes the loose-coupling by eliminating the need to bind
 * application-specific classes into the code. That means the code interacts
 * solely with the resultant interface or abstract class, so that it will work
 * with any classes that implement that interface or that extends that abstract
 * class.
 * 
 * Usage of Factory Design Pattern
 * 
 * _ When a class doesn't know what sub-classes will be required to create
 * 
 * _ When a class wants that its sub-classes specify the objects to be created.
 * 
 * _ When the parent classes choose the creation of objects to its sub-classes.
 *
 */

// https://gpcoder.com/4352-huong-dan-java-design-pattern-factory-method/
/**
 * 
 * 1. Factory Method Pattern là gì?
 * 
 * Factory Method Design Pattern hay gọi ngắn gọn là Factory Pattern là một
 * trong những Pattern thuộc nhóm Creational Design Pattern. Nhiệm vụ của
 * Factory Pattern là quản lý và trả về các đối tượng theo yêu cầu, giúp cho
 * việc khởi tạo đổi tượng một cách linh hoạt hơn.
 * 
 * Factory Pattern đúng nghĩa là một nhà máy, và nhà máy này sẽ “sản xuất” các
 * đối tượng theo yêu cầu của chúng ta.
 * 
 * Trong Factory Pattern, chúng ta tạo đối tượng mà không để lộ logic tạo đối
 * tượng ở phía người dùng và tham chiếu đến đối tượng mới được tạo ra bằng cách
 * sử dụng một interface chung.
 * 
 * Factory Pattern được sử dụng khi có một class cha (super-class) với nhiều
 * class con (sub-class), dựa trên đầu vào và phải trả về 1 trong những class
 * con đó.
 * 
 * 2. Sử dụng Factory Pattern khi nào? Factory Pattern được sử dụng khi:
 * 
 * Chúng ta có một super class với nhiều class con và dựa trên đầu vào, chúng ta
 * cần trả về một class con. Mô hình này giúp chúng ta đưa trách nhiệm của việc
 * khởi tạo một lớp từ phía người dùng (client) sang lớp Factory.
 * 
 * Chúng ta không biết sau này sẽ cần đến những lớp con nào nữa. Khi cần mở
 * rộng, hãy tạo ra sub class và implement thêm vào factory method cho việc khởi
 * tạo sub class này.
 * 
 * 3. Lợi ích của Factory Pattern là gì? Lợi ích của Factory Pattern:
 * 
 * Factory Pattern giúp giảm sự phụ thuộc giữa các module (loose coupling): cung
 * cấp 1 hướng tiếp cận với Interface thay thì các implement. Giúp chuơng trình
 * độc lập với những lớp cụ thể mà chúng ta cần tạo 1 đối tượng, code ở phía
 * client không bị ảnh hưởng khi thay đổi logic ở factory hay sub class.
 * 
 * Mở rộng code dễ dàng hơn: khi cần mở rộng, chỉ việc tạo ra sub class và
 * implement thêm vào factory method.
 * 
 * Khởi tạo các Objects mà che giấu đi xử lí logic của việc khởi tạo đấy. Người
 * dùng không biết logic thực sực được khởi tạo bên dưới phương thức factory.
 * 
 * Dễ dạng quản lý life cycle của các Object được tạo bởi Factory Pattern.
 * 
 * Thống nhất về naming convention: giúp cho các developer có thể hiểu về cấu
 * trúc source code.
 * 
 */