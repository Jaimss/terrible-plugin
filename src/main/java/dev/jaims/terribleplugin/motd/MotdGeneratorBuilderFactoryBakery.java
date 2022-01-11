package dev.jaims.terribleplugin.motd;

public class MotdGeneratorBuilderFactoryBakery extends AbstractFactoryFactory<MotdGeneratorBuilderFactory> {

    @Override
    public MotdGeneratorBuilderFactory bake() {
        return new MotdGeneratorBuilderFactory();
    }
}
