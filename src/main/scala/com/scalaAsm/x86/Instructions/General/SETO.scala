package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - overflow (OF=1)
// Category: general/datamov

trait SETO extends InstructionDefinition {
  val mnemonic = "SETO"
}

object SETO extends OneOperand[SETO] with SETOImpl

trait SETOImpl extends SETO {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x90) /+ 0
    val format = RmFormat
  }
}
