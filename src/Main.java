
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Напишите классы, реализующие оружие - пистолет, пулемет, гранатомет.
        // Все оружие должно уметь стрелять и выводить в консоль то, что именно оно стреляет
        // и сколько патронов осталось в магазине. У каждого типа оружия должно быть свое кол-во патронов в магазине
        // а также собственное имя, задаваемое через конструктор.
        // Создать класс человек, у которого должна быть ровно одна переменная,
        // хранящая оружие (оружие может быть одно но любое) и один метод на выстрел из этого оружия.
        // Метод должен выводить в консоль из какого оружия стреляет человек
        // (имя, указание какой тип оружия стреляет и сколько патронов осталось).
        // Переменная, хранящее в себе выбранное оружие должна быть приватной и задаваться при создании объекта человека.
        // Должна быть возможность смена оружия а также его перезарядка.
        // Человек должен уметь передавать свое оружие другому человеку.
        Pistol deagle = new Pistol("deagle", 3);
        MachineGun tratata = new MachineGun("tratata", 5);
          Human Jenga = new Human(deagle);
          Jenga.fire();
          Jenga.fire();
        Jenga.fire();
          Jenga.changeWeapon(tratata);
          Jenga.fire();
          Jenga.changeWeapon(deagle);
          Jenga.fire();
          Jenga.reloadWeapon(53);
          Jenga.fire();
          Human Stasa = new Human(deagle);
          Jenga.changeWeaponOwner(Stasa);
          Stasa.fire();
        }
    }
