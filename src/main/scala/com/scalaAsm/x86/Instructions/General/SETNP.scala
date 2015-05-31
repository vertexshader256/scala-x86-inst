package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not parity/parity odd
// Category: general/datamov

trait SETNP extends InstructionDefinition {
  val mnemonic = "SETNP"
}

object SETNP extends OneOperand[SETNP] with SETNPImpl

trait SETNPImpl extends SETNP {
  implicit object SETNP_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x9B) /+ 0
    val explicitFormat = new RmFormat{}
  }
}
