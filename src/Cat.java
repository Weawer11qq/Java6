class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    private final double MAX_JUMP_HEIGTH = 2;
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Cat run: true");
        else System.out.println("Cat run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("Cat swim: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("Cat jump: true");
        else System.out.println("Cat jump: fase");
    }
}