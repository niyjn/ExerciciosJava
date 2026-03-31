package Lista2;

import java.util.ArrayList;
import java.util.List;

abstract class unidade {
    public abstract void mover();
    public abstract void atacar();
}

class arqueiro extends unidade {
    @Override
    public void mover() {
        System.out.println("Arqueiro move 1 casa.");
    }

    @Override
    public void atacar() {
        System.out.println("Arqueiro ataca a distância.");
    }
}

class cavaleiro extends unidade {
    @Override
    public void mover() {
        System.out.println("Cavaleiro move 3 casas.");
    }

    @Override
    public void atacar() {
        System.out.println("Cavaleiro ataca corpo a corpo.");
    }
}

class torre extends unidade {
    @Override
    public void mover() {
        System.out.println("Não pode mover.");
    }

    @Override
    public void atacar() {
        System.out.println("Torre ataca com canhão.");
    }
}

public class JogoEstrategia {
    public static void main() {
        List<unidade> exercito = new ArrayList<>();
        exercito.add(new arqueiro());
        exercito.add(new cavaleiro());
        exercito.add(new torre());

        for (unidade u : exercito) {
            u.mover();
            u.atacar();
            System.out.println("---");
        }
    }
}
