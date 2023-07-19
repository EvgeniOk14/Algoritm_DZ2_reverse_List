public class Main {
    public static void main(String[] args)
    {

        SingleLinkList<Contact> contactList = new SingleLinkList<>();

        contactList.addToEnd(new Contact(123, "Васильев Евстахий Борисович", "+129381832"));
        contactList.addToEnd(new Contact(151, "Коновалов Степан Петрович", "+234432334"));
        contactList.addToEnd(new Contact(332, "Калинин Артём Валериевич", "+2234234423"));
        contactList.addToEnd(new Contact(432, "Предыбайло Григорий Анатолиевич", "+2342344234"));
        contactList.addToEnd(new Contact(556, "Степанов Мирослав Андреевич", "+6678877777"));

        for (Contact contact : contactList)
        {
            System.out.println(contact);
        }

        contactList.reverse();

        System.out.println("------------------------");

        for (Contact contact : contactList)
        {
            System.out.println(contact);
        }
    }
}
