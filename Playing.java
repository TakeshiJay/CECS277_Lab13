/**Playing is the current state of the puppy playing while testing if it played too much*/
public class Playing implements PuppyState {
    /**play is the puppies action that takes place where it chases the ball *up to 3 times, the puppy fall asleep after the third time
     * @param p is the puppy object that will be our used character
     */
    public void play(Puppy p) {
        int playMax = 3;
        p.incrementPlay();
        System.out.println("You throw the ball and the puppy excitedly chases it.");

        if (p.getPlay() == playMax){
            System.out.println("The puppy played so much it fell asleep");
            p.setState(new Asleep());
        }
    }

    /** feed is our puppies way of eating and uses a max of 3 
     * to ensure that the puppy doesnt eat too much
     * @param p is the puppy object that will be our used character
     */
    public void feed(Puppy p){
        System.out.println("You add a scoop to the bowl but the puppy doesn't want to eat conmtinue's playing");
    }

}