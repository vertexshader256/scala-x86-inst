package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - sign (SF=1)
// Category: general/datamov

trait SETS extends InstructionDefinition {
  val mnemonic = "SETS"
}

object SETS extends SETS with OneOperand[SETS] with SETSImpl

trait SETSImpl {
  self: SETS =>
  implicit object SETS_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x98) /+ 0
  }
}
