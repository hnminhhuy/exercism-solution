class LogLineParser
  # Matches a log line in the format:
  #   [LEVEL]: message
  #
  # Explanation:
  # \A                     - Start of string (strict, not line-based)
  # \[                     - Literal opening bracket
  # (INFO|WARNING|ERROR)   - Capture group for allowed log levels
  # \]                     - Literal closing bracket
  # :                      - Literal colon
  # \s*                    - Optional whitespace after colon (spaces, tabs, etc.)
  # (.*)                   - Capture the remaining message (including newlines)
  # \z                     - End of string (strict end, not before newline)
  # /m                     - Multiline mode so '.' also matches newline characters
  LOG_FORMAT = /\A\[(INFO|WARNING|ERROR)\]:\s*(.*)\z/m

  attr_reader :level, :msg
  
  def initialize(line)
    match = line.match(LOG_FORMAT)
    raise ArgumentError, "Invalid log format" unless match

    @level = match[1].downcase
    @msg = match[2].strip
  end
  
  def message
    @msg
  end

  def log_level
   @level
  end

  def reformat
    "#{@msg} (#{@level})"
  end
end
