package homework.stage13.model.entity;

import java.util.ArrayList;

public class Kit {
    private ArrayList<Artifact> artifacts;

    public Kit() {
        artifacts = new ArrayList<>();
    }

    public Kit(Artifact[] artifacts) {
        if (artifacts != null) {
            this.artifacts = new ArrayList<>();
            for (Artifact art : artifacts) {
                this.artifacts.add(art);
            }
        } else {
            artifacts = new Artifact[0];
        }

    }

    public int size() {
        return artifacts.size();
    }

    public Artifact get(int index) {
        if (index >= 0 && index < artifacts.size()) {
            return artifacts.get(index);
        } else {
            return null;
        }
    }

    public void add(Artifact artifact) {
        ArrayList<Artifact> temp = new ArrayList<>();

        for (Artifact art : artifacts) {
            temp.add(art);
        }


        temp.add(artifact);
        artifacts = temp;

    }

    public void remove(Artifact artifact) {
        ArrayList<Artifact> temp = new ArrayList<>();
        boolean flag = false;

        for (int i = 0; i < artifacts.size(); i++) {
            if (flag || (artifacts.get(i).getPower() != artifact.getPower() || artifacts.get(i).getRecovery() != artifact.getRecovery() ||
                    artifacts.get(i).getStamina() != artifact.getStamina() || !artifacts.get(i).getElement().equals(artifact.getElement()))) {
                temp.add(artifacts.get(i));
            } else {
                flag = true;
            }

        }

        artifacts = temp;

    }


    public void remove(int index) {
        ArrayList<Artifact> temp = new ArrayList<>();

        for (int i = 0; i < artifacts.size(); i++) {
            if (index != i) {
                temp.add(artifacts.get(i));
            }
        }

        artifacts = temp;

    }


}


