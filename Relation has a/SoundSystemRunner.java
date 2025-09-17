class SoundSystemRunner {
    public static void main(String[] args) {
        Speaker speaker = new Speaker("Dolby Atmos");
        SoundSystem soundSystem = new SoundSystem(speaker);

        soundSystem.displaySoundSystem();
    }
}
