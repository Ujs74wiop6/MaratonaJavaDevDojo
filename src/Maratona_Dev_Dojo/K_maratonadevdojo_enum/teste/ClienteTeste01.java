/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.K_maratonadevdojo_enum.teste;

import Maratona_Dev_Dojo.K_maratonadevdojo_enum.dominio.Cliente;
import Maratona_Dev_Dojo.K_maratonadevdojo_enum.dominio.TipoPagamento;
import Maratona_Dev_Dojo.K_maratonadevdojo_enum.dominio.TipoCliente;

/**
 *
 * @author Fabricio
 */
public class ClienteTeste01 {

    public static void main(String[] args) {
        //O Cliente , O tipo do Cliente, O Tipo de Pagamento do Cliente.
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);

    }
}
