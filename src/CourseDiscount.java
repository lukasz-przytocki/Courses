public class CourseDiscount {

    double discount(Courses course1, Courses course2, Courses course3){
        return (course1.price + course2.price + course3.price)*0.9;

    }

    double totalTime(Courses course1, Courses course2, Courses course3){
        return course1.course1Length+course2.course1Length+course3.course1Length;
    }


}
