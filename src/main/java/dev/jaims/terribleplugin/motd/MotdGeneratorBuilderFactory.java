package dev.jaims.terribleplugin.motd;

public class MotdGeneratorBuilderFactory extends AbstractFactory<MotdGeneratorBuilder> {

    @Override
    public MotdGeneratorBuilder bake() {
        return new MotdGeneratorBuilder();
    }
}
