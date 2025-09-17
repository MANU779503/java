class SoundSystem {
    public String systemSpeaker;
    public Speaker speaker;

    public SoundSystem(Speaker speaker) {
        this.systemSpeaker = speaker.speakerType;
        this.speaker = speaker;
    }

    public void displaySoundSystem() {
        speaker.speakerDetails();
    }
}
