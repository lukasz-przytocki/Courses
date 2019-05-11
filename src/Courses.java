
public class Courses {
    String course;
    int course1Length;
    double price;
    CourseCategory category;

    Courses(String coursee, int courseLengthh, double pricee, CourseCategory categoryy){
        course = coursee;
        course1Length = courseLengthh;
        price = pricee;
        category = categoryy;
    }

    void printInfo(){
        System.out.println(course +" length: " + course1Length +"min price:" + price
        + " category " + category.courseCategory + " description: " + category.courseCategoryDescription);
    }
}
