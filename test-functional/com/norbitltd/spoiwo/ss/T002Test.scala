package com.norbitltd.spoiwo.ss

class T002Test {

  def creatingCells() {
    Workbook(
      Sheet(
        name = "new sheet",
        rows = Row(Cell(1), Cell(1.2), Cell("This is a string"), Cell(true)) :: Nil
      )
    ).save("workbook.xls")
  }

}