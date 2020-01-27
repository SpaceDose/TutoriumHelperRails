class WelcomeController < ApplicationController
  
  def index
    @files = Dir.entries("./public/files/") - [".", "..", ".keep"]
  end

end
