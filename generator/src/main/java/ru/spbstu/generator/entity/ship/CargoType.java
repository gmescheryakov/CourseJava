package ru.spbstu.generator.entity.ship;

public enum CargoType
{
  LOOSE(0),
  LIQUID(1),
  CONTAINER(2);

  public final int number;

  CargoType(int number)
  {
    this.number = number;
  }
}
