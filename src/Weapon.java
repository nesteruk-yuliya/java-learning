public class Weapon {
        public String weaponName;
        public int numbersOfBullets;
        public String weaponType;

        public void fire() {
                if (this.numbersOfBullets > 0) {
                        System.out.println(weaponName + " " + weaponType + " has fired!");
                        System.out.println(--numbersOfBullets + " bullets is left");
                        System.out.println();
                } else {
                      System.out.println(this.weaponName + " has no bullets. Reload!");
                }
        }


