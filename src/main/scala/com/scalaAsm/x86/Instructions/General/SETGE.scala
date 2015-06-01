package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not less/greater or equal (SF=OF)
// Category: general/datamov

trait SETGE extends InstructionDefinition {
  val mnemonic = "SETGE"
}

object SETGE extends OneOperand[SETGE] with SETGEImpl

trait SETGEImpl extends SETGE {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9D) /+ 0
    val format = RmFormat
  }
}
