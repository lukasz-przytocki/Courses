class CoursesPlatform {
    public static void main(String[] args) {
        CourseCategory category1 = new CourseCategory("Programming", "Best programming tutorials online");
        CourseCategory category2 = new CourseCategory("Self development", "Learn How to become the best version of Yourself Today");

        Courses course1 = new Courses("Java", 5400, 199, category1);
        Courses course2 = new Courses("Android", 3600, 149, category1);
        Courses course3 = new Courses("Fast Reading", 2200, 139, category2);

        course1.printInfo();
        course2.printInfo();
        course3.printInfo();

        CourseDiscount discount = new CourseDiscount();

        System.out.println("  > Price after discount:" + discount.discount(course1,course2,course3) );

        System.out.println("You will need " +(int)(discount.totalTime(course1,course2,course3)/60)+ " hours "  +(int)(discount.totalTime(course1,course2,course3)%60) +" min to finish all courses.");
/*

        String course1 = "Java";
        int course1Length = 5400; //minutes
        String course1Category = "Programming";
        String course1CategoryDescription = "Best programming tutorials online";
        double price1 = 199; //zl

        String course2 = "Android";
        int course2Length = 3600; //minutes
        String course2Category = "Programming";
        String course2CategoryDescription = "Best programming tutorials online";
        double price2 = 149;

        String course3 = "Fast Reading";
        int course3Length = 2200; //minutes
        String course3Category = "Self development";
        String course3CategoryDescription = "Learn How to become the best version of Yourself Today";
        double price3 = 139;

        System.out.println("There are 3 courses in our database:");
        System.out.println(course1 + ", category: " + course1Category + ", length: " + course1Length + "min" + "price: " + price1);
        System.out.println(course2 + ", category: " + course2Category + ", length: " + course2Length + "min" + "price: " + price2);
        System.out.println(course3 + ", category: " + course3Category + ", length: " + course3Length + "min" + "price: " + price3);

        System.out.println("Special offer! Buy 3 courses and save 10%");
        double totalPrice = price1 + price2 + price3;
        double discountPrice = totalPrice * 0.9;
        System.out.printf("  > Price after discount: %.2fzl (before: %.2fzl)", discountPrice, totalPrice);
        */
    }
}