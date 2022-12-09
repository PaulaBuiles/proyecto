package cue.clothingshopfinal.exceptions;


public class InputValidations {

    public void emptyInput(String name, String pass, String gamil, String id)throws InputException{
        if (name.isEmpty()||pass.isEmpty()||gamil.isEmpty()||id.isEmpty()){
            throw new InputException("Debe llenar todos los campos");
        }
    }

    public void intInput(String str)throws InputException{
        try{
            Integer i;
            i = Integer.parseInt(str);
            if (i<=0){
                throw new InputException("No se admiten valores negativos");
            }
        }catch(NumberFormatException e){
            throw new InputException("Campo inválido, sólo se aceptan números");
        }
    }

    public void mailInput(String str)throws InputException{
        if (str.contains("@")){
            throw new InputException("Debe ingresar un correo electronico valido");
        }
    }



}
