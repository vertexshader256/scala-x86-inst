package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not zero/not equal (ZF=1)
// Category: general/datamov

trait SETNE extends InstructionDefinition {
  val mnemonic = "SETNE"
}

object SETNE extends SETNE with OneOperand[SETNE] with SETNEImpl

trait SETNEImpl {
  self: SETNE =>
  implicit object SETNE_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x95) /+ 0
  }
}
