package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not sign (SF=0)
// Category: general/datamov

trait SETNS extends InstructionDefinition {
  val mnemonic = "SETNS"
}

object SETNS extends OneOperand[SETNS] with SETNSImpl

trait SETNSImpl extends SETNS {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x99) /+ 0
    val format = RmFormat
  }
}
