# APCS

AP Computer Science 2022-23  
Dr. Kessner  
Marlborough School, Los Angeles  

[live site](https://dkessner.github.io/APCS/)  

[APCS 2021-22 website](https://dkessner.github.io/APCS_2021-22/)  
[APCS 2021-22 repo](https://github.com/dkessner/APCS_2021-22)  


## Usage

### Building the book

If you'd like to develop and/or build the APCS book, you should:

1. Clone this repository
2. Run `pip install -r requirements.txt` (it is recommended you do this within a virtual environment)
3. (Optional) Edit the books source files located in the `APCS/` directory
4. Run `jupyter-book clean APCS/` to remove any existing builds
5. Run `jupyter-book build APCS/`

A fully-rendered HTML version of the book will be built in `APCS/_build/html/`.

## Credits

This project is created using the excellent open source [Jupyter Book
project](https://jupyterbook.org/) and the
[executablebooks/cookiecutter-jupyter-book
template](https://github.com/executablebooks/cookiecutter-jupyter-book).
