public class MyClass {
    private String Name;
    private String Surname;
    private int Age;
    private String Lessons;
    private String FavoriteFood;

    public MyClass(String name, String surname, int age, String[] lessons, String favoriteFood) {
        this.Name = name;
        this.Surname = surname;
        this.Age = age;
        this.Lessons = String.valueOf(lessons);
        this.FavoriteFood = favoriteFood;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getLessons() {
        return Lessons;
    }

    public void setLessons(String lessons) {
        Lessons = lessons;
    }

    public String getFavoriteFood() {
        return FavoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        FavoriteFood = favoriteFood;
    }
}

