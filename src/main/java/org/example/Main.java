package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            private static final Logger logger = LogManager.getLogger(RegistroApp.class);
            public static void main(String[] args) {
                logger.info("Inicio de la aplicación.");
                logger.warn("Este es un mensaje de advertencia.");
                logger.error("Se ha producido un error.");
                logger.debug("Mensaje de depuración.");
            }
        }
