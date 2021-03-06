public abstract class Animal {

    protected String name;
    private int age;
    private int weight;
    private String color;

//    Как мне кажется тут получается некий "велосипед" по выборке лет/год/года, но пока что как лучше это сделать я ещё не придумал

    private int getLastYearNumber() {
        return getAge() % 10;
    }

    public String yearEnding(){
        if ((age == 1) || (age >=10) && (age <=20)) {
            return ("лет");
        } else if ((getLastYearNumber() >=2) && (getLastYearNumber() <=4)) {
           return ("года");
        } else if ((getLastYearNumber() >=5) && (getLastYearNumber() <=9)) {
            return ("лет");
        } else  {
            throw new IllegalArgumentException("Некорректно задан возраст.");
        }
    }

    public void say() {
        System.out.println("Я говорю");
    }
    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Привет! меня зовут " + name + ", мне " + age + " " + yearEnding() + ", я вешу - " + weight + "кг, мой цвет - " + color;
    }
}
