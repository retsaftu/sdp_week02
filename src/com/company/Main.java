package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IMailUser user1 = new MailUser("Tima");
        IMailUser user2 = new MailUser("Motroskin");
        IMailUser user3 = new MailUser("Sharik");
        IMailUser user4 = new MailUser("Fedor");

        IPostOffice postOffice1 = new PostOffice("KazPoshta");
        IPostOffice postOffice2 = new PostOffice("poshtaRussia");
        IPostOffice postOffice3 = new PostOffice("Ponyexpress");
        IPostOffice postOffice4 = new PostOffice("DHL");

        postOffice1.mailUser(user1);
        postOffice1.mailUser(user3);

        postOffice2.mailUser(user1);

        postOffice3.mailUser(user1);
        postOffice3.mailUser(user2);
        postOffice3.mailUser(user3);

        postOffice4.mailUser(user1);
        postOffice4.mailUser(user2);
        postOffice4.mailUser(user3);
        postOffice4.mailUser(user4);

        postOffice1.notifycationToUser("You have a mail!!");
        postOffice2.notifycationToUser("you have a package!");
        postOffice3.notifycationToUser("new format of mail is available");
        postOffice4.notifycationToUser("Stop using other post office, DHL is best");
    }
}
