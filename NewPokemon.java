
public class NewPokemon extends Pokemon{

    private String pokemonName;
    private int attackPower;
    private int hpHealth;


    NewPokemon(String pokemonName, int attackPower,int hpHealth,String pokemonElementType, Boolean isEvolve){
        super(pokemonElementType, isEvolve);
        this.pokemonName = pokemonName;
        this.attackPower = attackPower;  
        this.hpHealth = hpHealth;  

    }

    public String getThisPokemonName(){
       return this.pokemonName;
    }

    public int gethpHealth(){
        return this.hpHealth;
     }


     public int getAttackPower(){
        return this.attackPower;
     }


    public String getThisPokemonElementType(){
        return this.pokemonElementType;
     }
     
     public boolean getThisPokemonisEvolve(){
        return this.isEvolve;
     }

 
     public void getAllInfo(){
        System.out.println("Name: " + getThisPokemonName() + " | " + 
                            "AttackPower: " + getAttackPower() + " | " + 
                            "HP :" + gethpHealth() + " | " + 
                            "ElementType: " + getThisPokemonElementType() + " | " + 
                            "Evolve-Status: " + getThisPokemonisEvolve());
     }

         ///duel
         public void AttackTo(NewPokemon enemy) {
            System.out.println(this.getThisPokemonName() + " VS " + enemy.getThisPokemonName());
            int result =  enemy.gethpHealth() - this.attackPower;
            System.out.println("==========POKEMON INFO============");
            this.getAllInfo();
            enemy.getAllInfo();
    
            System.out.println("=========ATTACK RESULT=============");
            System.out.println(enemy.getThisPokemonName() + " HEALTH IS NOW: " + result);
            System.out.println("===================================");
          
        }
      

    public static void main(String[] args) {
        NewPokemon pickachu = new NewPokemon("Pickachu",40, 100, "Electric",false);
        NewPokemon raichu = new NewPokemon("Raichu",60, 200,"Electric", true);
        NewPokemon charmander = new NewPokemon("Charmander",45, 101, "Fire",false);

                pickachu.AttackTo(charmander);
                charmander.AttackTo(pickachu);
                raichu.AttackTo(charmander);
   }  
}
