class WelcomeController < ApplicationController
  
  def index
    @files = Dir.entries("./public/files/") - [".", ".."]

    @is_tutor = false

    if params[:username].downcase! == "tutor"
      @is_tutor = true
    end

  end

  def new_file
    respond_to do |format|
      format.html
      format.js
    end
  end

end
