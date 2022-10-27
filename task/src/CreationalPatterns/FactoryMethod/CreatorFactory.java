package CreationalPatterns.FactoryMethod;

public class CreatorFactory extends Factory {

    public CreatorFactory(int flag) {
        super(flag);
    }

    @Override
    Dog create() {
        if(flag == 1){
            return new RoyalPoodle();
        }else if(flag == 2){
            return new DwarfPoodle();
        }else if(flag == 3){
            return new ToyPoodle();
        }
        throw new IllegalArgumentException();

    }
}
