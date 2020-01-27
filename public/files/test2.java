    <div class="files flex-grow-1">
        <ul class="list-group">
            <a href="#" class="list-group-item d-flex align-items-center folder">
                <%= image_tag("arrow_right.svg", class: "collapse_indicator") %>
                <%= image_tag("folder_open.svg") %>
                <%= @test %>
                
            </a>
            <a href="#" class="list-group-item d-flex align-items-center file">
                <%= image_tag("file.svg") %>
                <p>main.java</p>
            </a>
            <a href="#" class="list-group-item d-flex align-items-center file">
                <%= image_tag("file.svg") %>
                <p>yikes.java</p>
            </a>
        </ul>
        <ul class="list-group folder">
            <a href="#" class="list-group-item d-flex align-items-center folder">
                <%= image_tag("arrow_right.svg", class: "collapse_indicator") %>
                <%= image_tag("folder_open.svg") %>
                <p>Assignment 07</p>
          </a>
        </ul>
    </div>