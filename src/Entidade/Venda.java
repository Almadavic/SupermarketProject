package Entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import Enumerados.Pago;
import Enumerados.StatusVenda;
import Enumerados.TipoPagamento;
import Erro.Personalizado;

public class Venda {
 private List<ItemVenda> item = new ArrayList<>();
 private Cliente cliente=null;
 private Pago pago=null;
 private StatusVenda status=null;
 private TipoPagamento tipoPagamento=null;
 private Date agora = new Date();
 private Integer numero=null;
 private Integer parcelas=null;
 private Double descontos=null;
 
 
 
 
 
 
 
}
