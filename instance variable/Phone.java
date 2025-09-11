class Phone {
    public int[] contactNumbers = {123, 456, 789};

    public void listContacts() {
        System.out.println(contactNumbers.length);
        for (int i = 0; i < contactNumbers.length; i++) {
            System.out.println("Contact number: " + contactNumbers[i]);
        }
    }
}
