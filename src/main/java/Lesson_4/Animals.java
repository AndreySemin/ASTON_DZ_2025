  protected String name;
    Animals(){countAnimal++;}

    public Animals(String name){
        this.name = name;
        countAnimal ++;
    }
    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getCountAnimal(){return countAnimal;}
