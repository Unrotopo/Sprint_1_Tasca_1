# Projecte: Exercicis de Programació en Java

## Descripció
Aquest projecte conté diversos exercicis de programació en Java que exploren conceptes com herència, polimorfisme, interfícies, blocs d'inicialització i ús de membres estàtics.

## Requisits
- Java 8 o superior
- IDE compatible amb Java (Eclipse, IntelliJ IDEA, NetBeans o VS Code amb extensió Java)

## Estructura del Projecte

### Nivell 1

#### Exercici 1
- Crear una classe `Instrument` amb atributs `nom` i `preu`.
- Declarar el mètode abstracte `tocar()`.
- Implementar les classes `Vent`, `Corda` i `Percussió` que estenen `Instrument` i implementen `tocar()`.
- Demostrar el procés de càrrega d'una classe en Java utilitzant blocs estàtics.

#### Exercici 2
- Crear una classe `Cotxe` amb els atributs:
  - `marca` (estàtic final)
  - `model` (estàtic)
  - `potència` (final)
- Implementar els mètodes:
  - `frenar()` (estàtic)
  - `accelerar()` (no estàtic)
- Demostrar com invocar aquests mètodes des del `main()`.

### Nivell 2

#### Exercici 1
- Crear la classe `Telèfon` amb atributs `marca` i `model`, i el mètode `trucar(String numero)`.
- Crear les interfícies `Camera` i `Rellotge` amb els mètodes `fotografiar()` i `alarma()`.
- Implementar la classe `Smartphone` que hereta de `Telèfon` i implementa les interfícies `Camera` i `Rellotge`.
- Des del `main()`, crear un objecte `Smartphone` i cridar als seus mètodes.

### Nivell 3

#### Exercici 1
- Implementar una redacció de notícies esportives amb les següents classes:
  - `Redactor`: atributs `nom`, `DNI` (final) i `sou` (estàtic, inicialitzat a 1500€).
  - `Noticia`: atributs `titular`, `text`, `puntuació` i `preu`.
  - Subclasses de `Noticia` per esports (futbol, bàsquet, tenis, F1 i motociclisme) amb atributs específics.
  - Mètodes `calcularPreuNoticia()` i `calcularPuntuacioNoticia()` segons les regles definides.
- Implementar una classe principal amb un menú d'opcions:
  1. Introduir redactor.
  2. Eliminar redactor.
  3. Introduir notícia a un redactor.
  4. Eliminar notícia.
  5. Mostrar totes les notícies per redactor.
  6. Calcular puntuació de la notícia.
  7. Calcular preu-notícia.

## Com executar el projecte
1. Clonar aquest repositori:
   https://github.com/Unrotopo/Sprint_1_Tasca_1.git
3. Obrir el projecte en un IDE Java.
4. Compilar i executar la classe principal.

## Autors
Luis Portas Montero
