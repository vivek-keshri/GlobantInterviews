package varsions.java14;

public class New_Instance_of {
    public static void main(String[] args) {
        New_Instance_of new_instance_of = new New_Instance_of();
        AbstractFile abstractFile = new MusicFile();
        new_instance_of.useInstanceOf(abstractFile);
    }
    /*public void New_Instance_of(){
        AbstractFile abstractFile = new MusicFile();
        useInstanceOf(abstractFile);
    }*/

    private void useInstanceOf(AbstractFile abstractFile) {
        if(abstractFile instanceof MusicFile){
            ((MusicFile) abstractFile).playMusic();
        }

        if(abstractFile instanceof MusicFile musicFile){
            musicFile.playMusic();
        }
    }
}
