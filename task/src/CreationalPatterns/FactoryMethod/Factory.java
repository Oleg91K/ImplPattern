package CreationalPatterns.FactoryMethod;

import CreationalPatterns.FactoryMethod.Dog;

abstract class Factory {
    public int flag;

    public Factory(int flag) {
        this.flag = flag;
    }

    abstract Dog create();


}
