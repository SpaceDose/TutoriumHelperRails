class WelcomeController < ApplicationController
  
  def index
    @files = Dir.entries("./public/files/") - [".", "..", ".keep"]
  end

  def new_file
    respond_to do |format|
      format.html
      format.js
    end
  end

end
