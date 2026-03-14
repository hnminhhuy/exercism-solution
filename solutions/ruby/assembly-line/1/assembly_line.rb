class AssemblyLine
  INT_SIXTY = 60
  PRODUCED_CAR_PER_HOUR = 221
  
  def initialize(speed)
    @speed = speed
  end

  def success_rate
    @success_rate = 
      if @speed <= 4
        1
      elsif @speed <= 8
        0.9
      elsif @speed == 9
        0.8
      else
        0.77
      end
  end

  def production_rate_per_hour
     @speed * success_rate * PRODUCED_CAR_PER_HOUR
  end

  def working_items_per_minute
    (production_rate_per_hour / INT_SIXTY).to_i
  end
end
