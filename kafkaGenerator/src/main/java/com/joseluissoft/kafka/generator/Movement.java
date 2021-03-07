package com.joseluissoft.kafka.generator;

import lombok.Data;

@Data public class Movement {
 private long importe;
 private String moneda;
 private String concepto;
 private String clasificacion;
 private String comercio;
}
