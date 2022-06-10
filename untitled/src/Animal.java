public abstract class Animal {

    protected String name;
    public int age;
    public int weight;
    public String color;

//    Как мне кажется тут получается некий "велосипед" по выборке лет/год/года, но пока что как лучше это сделать я ещё не придумал
    public int last_year_number = age %10;

    public String yearEnd(){
        if ((age == 1) || (age >=10) && (age <=20)) {
            System.out.println("лет");
        } else if ((last_year_number >=2) && (last_year_number <=4)) {
            System.out.println("года");
        } else if ((last_year_number >=5) && (last_year_number <=9)) {
            System.out.println("лет");
        }
        throw new NullPointerException("Некорректно задан возраст.");
    }

    public void Say() {
        System.out.println("Я говорю");
    }
    public void Go() {
        System.out.println("Я иду");
    }

    public void Drink() {
        System.out.println("Я пью");
    }

    public void Eat() {
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
        return "Привет! меня зовут" + name + ", мне" + age + yearEnd() + ", я вешу -" + weight + "кг, мой цвет - " + color;
    }
}
