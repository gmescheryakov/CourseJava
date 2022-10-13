package ru.spbstu.generator.entity.cranes;

public class LooseCrane extends Crane
{
  private static final int LIFTING_CAPACITY = 160;
  private static final int UNLOADING_TIME = 10;

  public LooseCrane(long releaseTime)
  {
    super(releaseTime);
  }

  @Override
  public int getLiftingCapacity()
  {
    return LIFTING_CAPACITY;
  }

  @Override
  public int getUnloadingTime()
  {
    return UNLOADING_TIME;
  }

  @Override
  public double unloadingSpeed()
  {
    return (double) LIFTING_CAPACITY / UNLOADING_TIME;
  }
}
