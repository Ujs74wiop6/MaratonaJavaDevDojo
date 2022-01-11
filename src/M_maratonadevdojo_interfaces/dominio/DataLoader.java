/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package M_maratonadevdojo_interfaces.dominio;

/**
 *
 * @author Fabricio
 */
public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    abstract void load();

    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
    
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
    
}
